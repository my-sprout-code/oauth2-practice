package ssafy.com.kkyuwoo.happyhouse;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ssafy.com.kkyuwoo.happyhouse.domain.board.Board;
import ssafy.com.kkyuwoo.happyhouse.domain.board.BoardRepository;
import ssafy.com.kkyuwoo.happyhouse.domain.board.BoardType;
import ssafy.com.kkyuwoo.happyhouse.domain.user.Role;
import ssafy.com.kkyuwoo.happyhouse.domain.user.SocialType;
import ssafy.com.kkyuwoo.happyhouse.domain.user.User;
import ssafy.com.kkyuwoo.happyhouse.domain.user.UserRepository;

import java.util.stream.IntStream;

@SpringBootApplication
public class HappyhouseApplication {

    public static void main(String[] args) {
        SpringApplication.run(HappyhouseApplication.class, args);
    }

//    @Bean
//    public CommandLineRunner runner(UserRepository userRepository, BoardRepository boardRepository) {
//        User user = userRepository.findByEmail("kwj1270@naver.com").get();
//
//        return (args) -> {
//            IntStream.rangeClosed(1, 200).forEach(index -> {
//                boardRepository.save(boardRepository.save(Board.builder()
//                                .user(user)
//                                .boardType(BoardType.FREE_BOARD)
//                                .content("하이 에이치 아이")
//                                .title("60억 포켓몬스터 중 " + index + "번째가 남긴 글")
//                                .count(0)
//                                .build()
//                        )
//                );
//            });
//        };
//    }

}
