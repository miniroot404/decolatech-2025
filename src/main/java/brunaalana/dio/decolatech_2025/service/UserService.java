package brunaalana.dio.decolatech_2025.service;

import brunaalana.dio.decolatech_2025.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
