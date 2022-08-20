package eyemed.group.util;

import eyemed.group.controllers.api.exceptions.DaoException;
import oracle.sql.TIMESTAMP;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.springframework.util.StringUtils;

import javax.sql.DataSource;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A library of convenience methods.
 * @author: Vijayakumar Ramaswamy
 * @since: 10/3/2018
 */
public class DBUtils {

    protected static final Log LOG = LogFactory.getLog( DBUtils.class );
    public static final String INVALID_DATE = "9999-12-31";

    /** Compares two strings for equality where either can be null. */
    public static final boolean areEqual( final String string1, final String string2 ) {
        return ( string1 == null ? string2 == null : string1.equals( string2 ) );
    }

    /**
     * Convenience method to get a Connection from a datasource.
     * This method will log any exceptions that may occur and return
     * a null Connection.
     */
    public static final Connection getConnection( final DataSource dataSource ) {
        Connection connection = null;
        if ( dataSource != null ) {
            try {
                connection = dataSource.getConnection();
            }
            catch( final Throwable t ) {
                if ( LOG.isWarnEnabled() ) {
                    LOG.warn( "Exception getting Connection from the DataSource.", t );
                }
            }
        }
        return connection;
    }

    /** Convenience method to close a list of objects. */
    public static final void close( final Object ... objects ) {
        if ( objects != null ) {
            for ( Object object : objects ) {
                close( object );
            }
        }
    }

    /**
     * Convenience method to close various closable objects. This method will
     * call the close() method on any object that has one and will Log any
     * exceptions without propagating them to the caller.
     */
    public static final void close( final Object object ) {
        if ( object != null ) {
            if ( object instanceof Connection ) {
                try {
                    ((Connection) object).close();
                }
                catch (final Throwable t) {
                    if (LOG.isWarnEnabled()) {
                        LOG.warn("Error closing connection.", t);
                    }
                }
            }
            if ( object instanceof Statement) {
                try {
                    ((Statement) object).close();
                }
                catch (final Throwable t) {
                    if (LOG.isWarnEnabled()) {
                        LOG.warn("Error closing statement.", t);
                    }
                }
            }
            if ( object instanceof ResultSet) {
                try {
                    ((ResultSet) object).close();
                }
                catch (final Throwable t) {
                    if (LOG.isWarnEnabled()) {
                        LOG.warn("Error closing result set.", t);
                    }
                }
            }
            if ( object instanceof Reader) {
                try {
                    ((Reader) object).close();
                }
                catch (final Throwable t) {
                    if (LOG.isWarnEnabled()) {
                        LOG.warn("Error closing Reader.", t);
                    }
                }
            }
            if ( object instanceof Writer) {
                try {
                    ((Writer) object).close();
                }
                catch (final Throwable t) {
                    if (LOG.isWarnEnabled()) {
                        LOG.warn("Error closing Writer.", t);
                    }
                }
            }
            if ( object instanceof InputStream) {
                try {
                    ((InputStream) object).close();
                }
                catch (final Throwable t) {
                    if (LOG.isWarnEnabled()) {
                        LOG.warn("Error closing InputStream.", t);
                    }
                }
            }
            if ( object instanceof OutputStream) {
                try {
                    ((OutputStream) object).close();
                }
                catch (final Throwable t) {
                    if (LOG.isWarnEnabled()) {
                        LOG.warn("Error closing OutputStream.", t);
                    }
                }
            }
        }
    }

    /* Indicates if a string is empty (i.e. blank or null). */
    public static final boolean isEmpty( final String string ) {
        return StringUtils.isEmpty( string );
    }

    /**
     * Indicates if an object is empty. Strings are empty if they are null or contain
     * only whitespace. Collections are empty if they are null, contain no elements, or
     * contain only empty elements. Maps are empty if they are null, contain no mappings,
     * or contain only mapping with all empty values. Other objects are empty if they are
     * null or have an "isEmpty()" method that returns true.
     */
    public static final boolean isEmpty( final Object object ) {
        if ( object instanceof String ) {
            return StringUtils.isEmpty( object.toString() );
        }
        else if ( object instanceof Collection ) {
            final Collection collection = (Collection)object;
            boolean result = true;
            if ( collection != null && !collection.isEmpty() ) {
                for( final Object obj : collection ) {
                    if ( !isEmpty( obj ) ) {
                        result = false;
                    }
                }
            }
            return result;
        }
        else if ( object instanceof Map) {
            final Map map = (Map)object;
            boolean result = true;
            if ( map != null && !map.isEmpty() ) {
                for ( final Object value : map.values() ) {
                    if ( !isEmpty( value ) ) {
                        result = false;
                    }
                }
            }
            return result;
        }
        else {
            if ( object != null ) {
                try {
                    final Class clazz = object.getClass();
                    final Method method = clazz.getMethod( "isEmpty" );
                    Boolean value = (Boolean)method.invoke( null );
                    return value;
                }
                catch( final Throwable t ) {
                    return false;
                }
            }
            else {
                return true;
            }
        }
    }

    /* Checks a var-arg or array of Objects to see if they are all empty. */
    public static final boolean allEmpty( final Object ... objects ) {
        boolean result = true;
        if ( objects != null ) {
            for ( final Object object : objects ) {
                if ( !isEmpty( object ) ) {
                    result = false;
                }
            }
        }
        return result;
    }

    /* Compares lists for same sizes (or both null). */
    public static boolean sameSize( final List l1, final List l2 ) {
        boolean ret = false;
        if ( l1 == null && l2 == null ) {
            ret = true;
        }
        else {
            if ( l1 != null && l2 != null ) {
                ret = l1.size() == l2.size();
            }
        }
        return ret;
    }

    /*
     * Converts a String to a Boolean. If null is passed in then null will be returned.
     * If the string matches the specified "yes" value then true will be returned -
     * otherwise false will be returned.
     */
    public static final Boolean toBoolean( final String string,
                                           final String yes ) {
        Boolean result = null;
        if ( string != null && yes != null ) {
            if ( yes.equals( string ) ) {
                result = true;
            }
            else {
                result = false;
            }
        }
        return result;
    }

    /* Converts a String to an Integer, or null if unable to convert. */
    public static final Integer toInteger( final String string ) {
        Integer result = null;
        if ( string != null ) {
            try {
                result = new Integer( string );
            }
            catch( final Throwable t ) {
                // return null if can't parse
            }
        }
        return result;
    }

    /* Converts a String to a Long, or null if unable to convert. */
    public static final Long toLong( final String string ) {
        Long result = null;
        if ( string != null ) {
            try {
                result = new Long(string);
            }
            catch( final Throwable t ) {
                // return null if can't parse
            }
        }
        return result;
    }

    /* Converts a String to a Float, or null if unable to convert. */
    public static final Float toFloat( final String string ) {
        Float result = null;
        if ( string != null ) {
            try {
                result = new Float( string );
            }
            catch( final Throwable t ) {
                // return null if can't parse
            }
        }
        return result;
    }

    /* Converts a String to a Double, or null if unable to convert. */
    public static final Double toDouble( final String string ) {
        Double result = null;
        if ( string != null ) {
            try {
                result = new Double( string );
            }
            catch( final Throwable t ) {
                // return null if can't parse
            }
        }
        return result;
    }

    /* Converts a String to a Short, or null if unable to convert. */
    public static final Short toShort( final String string ) {
        Short result = null;
        if ( string != null ) {
            try {
                result = new Short( string );
            }
            catch( final Throwable t ) {
                // return null if can't parse
            }
        }
        return result;
    }

    /* Converts a String to a Byte, or null if unable to convert. */
    public static final Byte toByte( final String string ) {
        Byte result = null;
        if ( string != null ) {
            try {
                result = new Byte( string );
            }
            catch( final Throwable t ) {
                // return null if can't parse
            }
        }
        return result;
    }

    /* Converts a String to a Character, or null if unable to convert. */
    public static final Character toCharacter( final String string ) {
        Character result = null;
        if ( string != null ) {
            try {
                result = string.trim().charAt( 0 );
            }
            catch( final Throwable t ) {
                // return null on error
            }
        }
        return result;
    }

    /* Converts a String to a Date using the given pattern. */
    public static final Date toDate( final String string, final String pattern ) {
        Date result = null;
        if ( string != null && pattern != null ) {
            try {
                result = new SimpleDateFormat( pattern ).parse(string);
            }
            catch( final Throwable t ) {
                // return null if can't parse
            }
        }
        return result;
    }

    /* Converts a String to a SQL Date using the given pattern. */
    public static final java.sql.Date toSqlDate( final String string, final String pattern ) {
        final Date date = toDate( string, pattern );
        if ( date != null ) {
            return new java.sql.Date( date.getTime() );
        }
        return null;
    }

    /* Converts a String to a JODA DateTime using the given pattern. */
    public static final DateTime toDateTime( final String string, final String pattern ) {
        DateTime result = null;
        if ( string != null && pattern != null ) {
            try {
                result = DateTimeFormat.forPattern( pattern ).parseDateTime(string);
            }
            catch( final Throwable t ) {
                // return null if can't parse
            }
        }
        return result;
    }

    /* Convert a JODA DateTime into a String using the given pattern. */
    public static final String toString( final DateTime dateTime, final String format ) {
        String result = null;
        if ( dateTime != null && format != null ) {
            result = dateTime.toString( format );
        }
        return result;
    }

    /* Convert a Date (including SQL dates) into a String using the given pattern. */
    public static final String toString( final Date date, final String format ) {
        String result = null;
        if ( date != null && format != null ) {
            result = new SimpleDateFormat( format ).format( date );
        }
        return result;
    }

    /* Convert an Object to a String; blank and null values will be returned as the specified nullReturn. */
    public static final String toString( final Object object, final String nullReturn ) {
        String result = nullReturn;
        try {
            if (object != null) {
                final String string = object.toString();
                result = !StringUtils.isEmpty( string ) ? string : nullReturn;
            }
        }
        catch( final Throwable t ) {
            // return null on errors
        }
        return result;
    }

    /* Convert an Object to a String; null values will be returned as null. */
    public static final String toString( final Object object ) {
        return toString( object, null );
    }

    /* Convert a Boolean to a String using the given yes/no values. */
    public static final String toString( final Boolean b, final String yes, final String no ) {
        String result = no;
        if ( b != null ) {
            if ( b ) {
                result = yes;
            }
        }
        return result;
    }


    /* Convert a JODA DateTime to a Date. */
    public static final Date toDate( final DateTime dateTime ) {
        Date result = null;
        if ( dateTime != null ) {
            result = new Date( dateTime.toDate().getTime() );
        }
        return result;
    }

    /* Convert a JODA DateTime to a SQL Date. */
    public static final java.sql.Date toSqlDate( final DateTime dateTime ) {
        java.sql.Date result = null;
        if ( dateTime != null ) {
            result = new java.sql.Date( dateTime.toDate().getTime() );
        }
        return result;
    }

    /* Convert a Date (including SQL dates) to a JODA DateTime. */
    public static final DateTime toDateTime( final Date date ) {
        DateTime result = null;
        if ( date != null ) {
            result = new DateTime( date.getTime() );
        }
        return result;
    }

    public static Timestamp toOracleDate(DateTime date) {
        if (date == null) {
            return null;
        }
        return new Timestamp(date.toDate().getTime());
    }

    public static Timestamp toOracleDate(LocalDate date) {
        if (date == null) {
            return null;
        }
        return new Timestamp(date.toDate().getTime());
    }

    /** Return the current Date. */
    public static final Date nowDate() {
        return new Date();
    }

    /** Return the current SQL Date. */
    public static final java.sql.Date nowSQLDate() {
        return new java.sql.Date( nowDate().getTime() );
    }

    /** Return the current Date. */
    public static final DateTime nowDateTime() {
        return new DateTime( nowDate().getTime() );
    }

    public static Date getValidTermDt(Date grpTermDt) throws SQLException {
        java.sql.Date invalidDt = java.sql.Date.valueOf(INVALID_DATE);
        if(grpTermDt!=null && grpTermDt.equals(invalidDt)) {
            return null;
        }else{
            return grpTermDt;
        }
    }

    /* Convert a var-arg or array of objects into a list. */
    public static final <T> List<T> toList( final T ... objects ) {
        final List<T> result = new ArrayList<T>();
        if ( objects != null && objects.length > 0 ) {
            for ( T object : objects ) {
                result.add( object );
            }
        }
        return result;
    }

    /* Convert a String of delimited elements into a List of Strings. */
    public static final List<String> toList( final String string, final String delimitor ) {
        List<String> result = new ArrayList<String>();
        if ( string != null && delimitor != null ) {
            result.addAll( Arrays.asList(string.split("\\s*" + delimitor + "\\s*")));
        }
        return result;
    }

    public static final int length( final String string ) {
        int result = 0;
        if ( string != null ) {
            result = string.length();
        }
        return result;
    }
    
    private static boolean isContain( final String source, String subItem ){
        String patternString = "^" + subItem;
        Pattern pattern = Pattern.compile( patternString );
        Matcher matcher = pattern.matcher( source );
        return matcher.find();
    }

    public static String toYNFlag(boolean booleanFlag) {
        return (booleanFlag == true ? "Y" : "N");
    }

    public static <T> List<List<T>> chunk(List<T> input, int chunkSize) {
        int inputSize = input.size();
        int chunkCount = (int) Math.ceil(inputSize / (double) chunkSize);

        Map<Integer, List<T>> map = new HashMap<>(chunkCount);
        List<List<T>> chunks = new ArrayList<>(chunkCount);

        for (int i = 0; i < inputSize; i++) {
            map.computeIfAbsent(i / chunkSize, (ignore) -> {
                List<T> chunk = new ArrayList<>();
                chunks.add(chunk);
                return chunk;
            }).add(input.get(i));
        }
        return chunks;
    }

    /**
     * returns default value if column is not present in resultset
     *
     * @param rs
     * @param columnLabel
     * @param defaultValue
     * @return
     */
    @SuppressWarnings("unchecked")
    public static  <T> T getValueFromResultSet(final ResultSet rs,
                                               String columnLabel, T defaultValue) {
        try {
            if(rs.getObject(columnLabel) instanceof TIMESTAMP){
                return (T) rs.getTimestamp(columnLabel);
            }else if(rs.getObject(columnLabel) instanceof BigDecimal){
                return (T) rs.getBigDecimal(columnLabel);
            }else {
                return (T) rs.getObject(columnLabel);
            }

        } catch (SQLException e) {
            return defaultValue;
        }
    }
    public static boolean executeStoredFunction(CallableStatement function) throws SQLException, DaoException {
        boolean status = function.execute();
        final int returnVal = function.getInt(1);
        if (returnVal == 0) {
            return true;
        }
        final String errorCode = function.getString(2);
        final String errorMsg = function.getString(3);
        if (!"0".equals(errorCode)) {
            throw new DaoException(errorCode + ": " + errorMsg);
        }
        return false;
    }

    public static ResultSet executeSFForResultSet(CallableStatement function) throws SQLException, DaoException {
        function.execute();
        final String errorCode = function.getString(3);
        if (!"000".equals(errorCode) && !"0".equals(errorCode)) {
            throw new DaoException(errorCode + ": " + function.getString(4));
        }
        if (0 == function.getInt(1)) {
            return (ResultSet) function.getObject(2);
        }
        return null;
    }
}