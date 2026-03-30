package br.com.fiap.javaadv.blog.backend.datasource.repositories;

import br.com.fiap.javaadv.blog.backend.domainmodel.entities.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;
import java.util.List;
import java.util.UUID;

public interface PostRepository extends JpaRepository<Post, UUID> {

    Page<Post> findByTitleContainingIgnoreCase(final String Title, Pageable pageable);
    Page<Post> findByTags_NameContainingIgnoreCase(final String tagName, Pageable pageable);
    List<Post> findAllByUserID(UUID userID);

}
