package ssafy.com.kkyuwoo.happyhouse.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import ssafy.com.kkyuwoo.happyhouse.domain.qna.QnA;
import ssafy.com.kkyuwoo.happyhouse.domain.qna.QnARepository;

@RequiredArgsConstructor
@Service
public class QnAService {
    private final QnARepository qnARepository;

    public Page<QnA> findAll(Pageable pageable) {
        return qnARepository.findAll(pageable);
    }

}
