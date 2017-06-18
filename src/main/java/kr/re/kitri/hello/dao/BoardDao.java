package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Member;
import kr.re.kitri.hello.model.Post;

import java.util.List;

public interface BoardDao {

    void insertPost(Post post);
    void insertMember(Member member);
    void updatePoint(String memberSeq);
    List<Post> selectPosts();
    Post selectPost(int postSeq);

}