package eyemed.group.model.dto.users;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

/**
 * @author: Vijayakumar Ramaswamy
 * @since: 10/15/18
 */
public enum AccessCodeEnum {
	PC("Primary Contact", true) {
		public void setAccessLevel(AccessDto accessDto) {
			accessDto.setPrimaryContact(true);
		}
	},
    MS("Member Search", false){
		public void setAccessLevel(AccessDto accessDto) {
			accessDto.setMemberSearchAllowed(true);
		}
	},
    MM("Member Maintenance", false){
		public void setAccessLevel(AccessDto accessDto) {
			accessDto.setMemberMaintenanceAllowed(true);
		}
	},
    IN("View Invoices", false){
		public void setAccessLevel(AccessDto accessDto) {
			accessDto.setViewInvoicesAllowed(true);
		}
	},
    US("Manage Users", false){
		public void setAccessLevel(AccessDto accessDto) {
			accessDto.setCreateGroupUsersAllowed(true);
		}
	};

	private String description;
    private boolean groupOnly;


    AccessCodeEnum(String description, boolean groupOnly) {
        this.description = description;
        this.groupOnly = groupOnly;
        
    }

    public String getDescription() {
        return description;
    }
    
    public boolean isGroupOnly() {
		return groupOnly;
	}

	public static EnumSet<AccessCodeEnum> toEnumSet(AccessDto accessDto) {
    	EnumSet<AccessCodeEnum> set = EnumSet.noneOf(AccessCodeEnum.class);
		if(accessDto.isPrimaryContact()){set.add(AccessCodeEnum.PC);}
    	if(accessDto.isMemberSearchAllowed()){set.add(AccessCodeEnum.MS);}
    	if(accessDto.isMemberMaintenanceAllowed()){set.add(AccessCodeEnum.MM);}
    	if(accessDto.isViewInvoicesAllowed()){set.add(AccessCodeEnum.IN);}
    	if(accessDto.isCreateGroupUsersAllowed()){set.add(AccessCodeEnum.US);}
    	return set;
    	
    }
	

	public static List<AccessCodeEnum> getAllAccessCodes() {
		List<AccessCodeEnum> codes = new ArrayList<AccessCodeEnum>();
		for(AccessCodeEnum code : AccessCodeEnum.values()) {
			codes.add(code);
		}
		return codes;
	}
    
}
