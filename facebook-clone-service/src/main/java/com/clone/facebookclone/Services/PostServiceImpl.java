package com.clone.facebookclone.Services;

import com.clone.facebookclone.Entity.PostEntity;
import com.clone.facebookclone.Model.PostModal;
import com.clone.facebookclone.Repository.IPostEntityRepository;
import com.fasterxml.jackson.databind.util.BeanUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements IPostService{

    private IPostEntityRepository postEntityRepository;

    public PostServiceImpl(IPostEntityRepository postEntityRepository) {
        this.postEntityRepository = postEntityRepository;
    }

    @Override
    public PostModal addPost(PostModal postModal) throws Exception {
        try {
            PostEntity postEntity = new PostEntity();
            BeanUtils.copyProperties(postModal, postEntity);

            if(postModal.getFile() != null && !postModal.getFile().equalsIgnoreCase("null")){
                postEntity.setImage(postModal.getFile());
            }
            else {
                postEntity.setImage(null);
            }
            postEntity = postEntityRepository.save(postEntity);
            postModal.setId(postEntity.getId());
            postModal.setFile(null);
            postModal.setImage(postEntity.getImage());

        }catch (Exception e){
            throw new Exception("Could not save Post" + e);
        }
        return postModal;
    }

    @Override
    public List<PostModal> getPost() {
        List<PostEntity> postEntities = postEntityRepository.findAll();
        List<PostModal> postModals = new ArrayList<>();
        postModals = postEntities.stream().map((postEntity) ->
                PostModal.builder()
                        .id(postEntity.getId())
                        .timeStamp(postEntity.getTimeStamp())
                        .email(postEntity.getEmail())
                        .name(postEntity.getName())
                        .post(postEntity.getPost())
                        .image(postEntity.getImage())
                        .profilePic(postEntity.getProfilePic())
                        .build()).collect(Collectors.toList());
        return postModals;
    }
}
