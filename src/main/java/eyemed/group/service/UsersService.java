package eyemed.group.service;

import eyemed.group.model.dto.users.UserCommunicationDto;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

public interface UsersService {


    Map<String, String> communication(UserCommunicationDto contactsDto, List<MultipartFile> attachments, String string) throws Exception;
}
