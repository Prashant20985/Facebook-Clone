package com.clone.facebookclone.Repository;

import com.clone.facebookclone.Entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPostEntityRepository extends JpaRepository<PostEntity, String> {
}
