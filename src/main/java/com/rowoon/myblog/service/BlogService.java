package com.rowoon.myblog.service;

import com.rowoon.myblog.domain.Article;
import com.rowoon.myblog.dto.AddArticleRequest;
import com.rowoon.myblog.repository.BlogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor // final이 붙거나 @NotNull이 붙은 필드의 생성자 추가
@Service
public class BlogService {

    private final BlogRepository blogRepository;

    // 블로그 글 추가 메서드
    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }

    // 블로그 모든 글 조회
    public List<Article> findAll() {
        return blogRepository.findAll();
    }

    // 특정 글 하나 조회
    public Article findById(Long id) {
        return blogRepository.findById(id)
                // 해당 글이 없을 때 예외 발생
                .orElseThrow(() -> new IllegalArgumentException("not found: " + id));
    }
}
