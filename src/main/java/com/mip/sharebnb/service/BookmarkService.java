package com.mip.sharebnb.service;

import com.mip.sharebnb.exception.DataNotFoundException;
import com.mip.sharebnb.model.Bookmark;
import com.mip.sharebnb.repository.BookmarkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookmarkService {

    private final BookmarkRepository bookmarkRepository;

    public List<Bookmark> findBookmarks(long memberId) {

        return bookmarkRepository.findBookmarksByMember_Id(memberId);
    }

    public void deleteBookmarkById(Long id) {
        bookmarkRepository.findById(id).orElseThrow(() -> new DataNotFoundException("Bookmark Not Found"));

        bookmarkRepository.deleteById(id);
    }
}