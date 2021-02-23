package com.jojodu.book.springboot.web.dto;

import com.jojodu.book.springboot.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {

    private String title;
    private String content;
    private String author;

    @Builder
    public PostsSaveRequestDto(String title, String content, String author){
        this.title = title;
        this.content=content;
        this.author = author;
        System.out.println(" PostsSaveRequestDto 생성");
    }

    public Posts toEntity(){
        return Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
    }

    public void print(){
        System.out.println(title);
        System.out.println(content);
        System.out.println(author);
    }
}
