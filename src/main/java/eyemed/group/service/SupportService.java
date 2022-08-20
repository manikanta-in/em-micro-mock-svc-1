package eyemed.group.service;

import java.util.List;
import java.util.Map;

import eyemed.group.model.dto.users.SupportContactsDto;
import org.springframework.web.multipart.MultipartFile;

public interface SupportService {

	public Map<String, String> contactUs(SupportContactsDto contactsDto, List<MultipartFile> attachments, String string) throws Exception;

}
