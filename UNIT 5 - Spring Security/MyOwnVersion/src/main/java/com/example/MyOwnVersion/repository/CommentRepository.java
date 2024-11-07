package com.example.MyOwnVersion.repository;

import com.example.MyOwnVersion.dto.view.ViewComment;
import com.example.MyOwnVersion.model.CommentEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface CommentRepository extends JpaRepository<CommentEntity, Long> {

    @Modifying
    @Transactional
    @Query("DELETE FROM CommentEntity c WHERE c.postEntity.id = :postId")
    void deleteCommentByPostId(Long postId);

    @Modifying
    @Transactional
    @Query("DELETE FROM CommentEntity c WHERE c.userEntity.id = :userId")
    void deleteCommentByUserId(Long userId);

    @Query(value = """
            select new com.example.MyOwnVersion.dto.view.ViewComment(c.id, c.comment, c.postEntity.id, c.userEntity.id)
            from CommentEntity c
            """)
    Page<ViewComment> findAllComment(Pageable pageable);
}
