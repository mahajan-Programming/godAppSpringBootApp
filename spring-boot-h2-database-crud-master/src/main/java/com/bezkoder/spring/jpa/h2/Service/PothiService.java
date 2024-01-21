package com.bezkoder.spring.jpa.h2.Service;

import com.bezkoder.spring.jpa.h2.dto.*;
import com.bezkoder.spring.jpa.h2.model.PothiEntity;
import com.bezkoder.spring.jpa.h2.repository.PothiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.apache.commons.collections4.CollectionUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

@Service
public class PothiService {

    @Autowired
    PothiRepository pothiRepository;


    public String addOrUpdateUser(DataRequestResponse request) {
        PothiEntity pothiEntity = new PothiEntity();
        if(request.getUserList().get(0).getUserId().equals(null)) {
            pothiEntity.setUserId(UUID.randomUUID().toString());
        }else if(null != request.getRequestResponseId()){
            pothiEntity.setId(request.getRequestResponseId());
        }
        pothiEntity.setUserName(request.getUserList().get(0).getUserName());

//        .save in db
        pothiRepository.save(pothiEntity);
        return "added successfully!";
    }

    public String newaddOrUpdateUser(DataRequestResponse request) {
        PothiEntity pothiEntity = new PothiEntity();
        if(null == request.getUserList().get(0).getUserId()) {
            pothiEntity.setUserId(UUID.randomUUID().toString());
            pothiEntity.setId(UUID.randomUUID().toString());
        }else if(null != request.getRequestResponseId()){
            pothiEntity.setId(request.getRequestResponseId());
        }
        pothiEntity.setUserName(request.getUserList().get(0).getUserName());

//        .save in db
        pothiRepository.save(pothiEntity);
        return "added successfully!";
    }

    public String newnewaddOrUpdateUser(DataRequestResponse request) {
        PothiEntity pothiEntity = new PothiEntity();
        if(null == request.getUserList().get(0).getUserId()) {
            pothiEntity.setUserId(UUID.randomUUID().toString());
            pothiEntity.setId(UUID.randomUUID().toString());
        }else {
            List<PothiEntity> pothiEntityList = pothiRepository.findByUserIdContainingIgnoreCase(request.getUserList().get(0).getUserId());
            for(PothiEntity pothi:pothiEntityList){
                pothi.setId(pothi.getId());

                pothi.setUserName(request.getUserList().get(0).getUserName());
                pothiRepository.save(pothi);
            }
            return "updated";
        }
        pothiEntity.setUserName(request.getUserList().get(0).getUserName());

//        .save in db
        pothiRepository.save(pothiEntity);
        return "added successfully!";
    }







    public String addOrUpdateBucket(DataRequestResponse request){
        PothiEntity pothiEntity = new PothiEntity();
        if(null == request.getUserList().get(0).getBucketList().get(0).getBucketId()){
            pothiEntity.setBucketId(UUID.randomUUID().toString());
            pothiEntity.setId(UUID.randomUUID().toString());
        }else{
            List<PothiEntity> pothiEntityList = pothiRepository.findByBucketIdContainingIgnoreCase(request.getUserList().get(0).getBucketList().get(0).getBucketId());
            for(PothiEntity pothi:pothiEntityList){
                pothi.setId(pothi.getId());
                pothi.setBucketName(request.getUserList().get(0).getBucketList().get(0).getBucketName());
                pothiRepository.save(pothi);
            }
            return "added";
        }
        pothiEntity.setUserId(request.getUserList().get(0).getUserId());
        pothiEntity.setUserName(request.getUserList().get(0).getUserName());
        pothiEntity.setBucketName(request.getUserList().get(0).getBucketList().get(0).getBucketName());
//        .save in db
        pothiRepository.save(pothiEntity);
        return "added successfully!";
    }

    public String addOrUpdateSection(DataRequestResponse request){
        PothiEntity pothiEntity = new PothiEntity();
        if(null == request.getUserList().get(0).getBucketList().get(0).getSectionList().get(0).getSectionId()){
            pothiEntity.setSectionId(UUID.randomUUID().toString());
            pothiEntity.setId(UUID.randomUUID().toString());
        }else{
            List<PothiEntity> pothiEntityList = pothiRepository.findBySectionIdContainingIgnoreCase(request.getUserList().get(0).getBucketList().get(0).getSectionList().get(0).getSectionId());
            for(PothiEntity pothi:pothiEntityList){
                pothi.setId(pothi.getId());
                pothi.setSectionName(request.getUserList().get(0).getBucketList().get(0).getSectionList().get(0).getSectionName());
                pothiRepository.save(pothi);
            }
            return "added";
        }
        pothiEntity.setUserId(request.getUserList().get(0).getUserId());
        pothiEntity.setUserName(request.getUserList().get(0).getUserName());

        pothiEntity.setBucketId(request.getUserList().get(0).getBucketList().get(0).getBucketId());
        pothiEntity.setBucketName(request.getUserList().get(0).getBucketList().get(0).getBucketName());

        pothiEntity.setSectionName(request.getUserList().get(0).getBucketList().get(0).getSectionList().get(0).getSectionName());
//        .save in db
        pothiRepository.save(pothiEntity);
        return "added successfully!";
    }

    public String addOrUpdateContent(DataRequestResponse request){
        PothiEntity pothiEntity = new PothiEntity();
        if(null == request.getUserList().get(0).getBucketList().get(0).getSectionList().get(0).getContentList().get(0).getContentId()){
            pothiEntity.setContentId(UUID.randomUUID().toString());
            pothiEntity.setId(UUID.randomUUID().toString());
        }else{
            List<PothiEntity> pothiEntityList = pothiRepository.findByContentIdContainingIgnoreCase(request.getUserList().get(0).getBucketList().get(0).getSectionList().get(0).getContentList().get(0).getContentId());
            for(PothiEntity pothi:pothiEntityList){
                pothi.setId(pothi.getId());
                pothi.setContentName(request.getUserList().get(0).getBucketList().get(0).getSectionList().get(0).getContentList().get(0).getContentName());
                pothi.setContentTag(request.getUserList().get(0).getBucketList().get(0).getSectionList().get(0).getContentList().get(0).getContentTag());

                pothiRepository.save(pothi);
            }
            return "added";
        }
        pothiEntity.setUserId(request.getUserList().get(0).getUserId());
        pothiEntity.setUserName(request.getUserList().get(0).getUserName());

        pothiEntity.setBucketId(request.getUserList().get(0).getBucketList().get(0).getBucketId());
        pothiEntity.setBucketName(request.getUserList().get(0).getBucketList().get(0).getBucketName());

        pothiEntity.setSectionId(request.getUserList().get(0).getBucketList().get(0).getSectionList().get(0).getSectionId());
        pothiEntity.setSectionName(request.getUserList().get(0).getBucketList().get(0).getSectionList().get(0).getSectionName());

        pothiEntity.setContentName(request.getUserList().get(0).getBucketList().get(0).getSectionList().get(0).getContentList().get(0).getContentName());
        pothiEntity.setFavourites(request.getUserList().get(0).getBucketList().get(0).getSectionList().get(0).getContentList().get(0).isFavourite());
        pothiEntity.setContentTag(request.getUserList().get(0).getBucketList().get(0).getSectionList().get(0).getContentList().get(0).getContentTag());

//        .save in db
        pothiRepository.save(pothiEntity);
        return "added successfully!";
    }


    public DataRequestResponse getAllData() {
        List<PothiEntity> pothiEntityList = pothiRepository.findAll();
        List<User> userList = new ArrayList<>();

        for(PothiEntity pothi : pothiEntityList){

            User user = CollectionUtils.emptyIfNull(userList).stream()
                    .filter(userFilter -> pothi.getUserId().equals(userFilter.getUserId()))
                    .findAny().orElse(null);
            if(null == user){
                user = new User();
                user.setUserId(pothi.getUserId());
                user.setUserName(pothi.getUserName());
                userList.add(user);
            }
//            user.getBucketList()
            Bucket bucket = CollectionUtils.emptyIfNull(user.getBucketList()).stream()
                    .filter(bucketFilter -> pothi.getBucketId().equals(bucketFilter.getBucketId()))
                    .findAny().orElse(null);
            if(null==bucket){
                if(null == pothi.getBucketId()){
                    continue;
                }
                if(null!= pothi.getBucketId()){

                bucket = new Bucket();
                bucket.setBucketId(pothi.getBucketId());
                bucket.setBucketName(pothi.getBucketName());
//                user.getBucketList().add(bucket);
//                    List<Bucket> buckets = user.getBucketList();
                    if(null==user.getBucketList()){
                    user.setBucketList(new ArrayList<>());
                    }
                    user.getBucketList().add(bucket);
                }
            }
            Section section = CollectionUtils.emptyIfNull(bucket.getSectionList()).stream()
                    .filter(sectionFilter -> pothi.getSectionId().equals(sectionFilter.getSectionId()))
                    .findAny().orElse(null);
            if(null==section){
                if(null == pothi.getSectionId()){
                    continue;
                }
                if(null!=pothi.getSectionId()){

                section = new Section();
                section.setSectionId(pothi.getSectionId());
                section.setSectionName(pothi.getSectionName());
                if(null==bucket.getSectionList()){
                bucket.setSectionList(new ArrayList<>());
                }
                bucket.getSectionList().add(section);

                }
            }
            Content content = CollectionUtils.emptyIfNull(section.getContentList()).stream()
                    .filter(contentFilter -> pothi.getContentId().equals(contentFilter.getContentId()))
                    .findAny().orElse(null);
            if(null == content){
                if(null == pothi.getContentId()){
                    continue;
                }
                if(null!=pothi.getContentId()){

                content = new Content();
                content.setContentId(pothi.getContentId());
                content.setContentName(pothi.getContentName());
                content.setContentTag(pothi.getContentTag());
                content.setFavourite(pothi.getFavourites());
                if(null==section.getContentList()){
                section.setContentList(new ArrayList<>());
                }
                section.getContentList().add(content);

                }
            }
        }
        DataRequestResponse response = new DataRequestResponse();
        response.setUserList(userList);
        return response;
    }
}
