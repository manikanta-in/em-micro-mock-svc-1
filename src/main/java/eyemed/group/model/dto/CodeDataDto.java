package eyemed.group.model.dto;

/**
 * Created by c09368 on 10/18/2018.
 */
public class CodeDataDto {
    private String code, description;

    public CodeDataDto() {
        super();
    }

    public CodeDataDto( final String code, final String description ) {
        super();
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode( final String code ) {
        this.code = code;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription( final String description ) {
        this.description = description;
    }

}
