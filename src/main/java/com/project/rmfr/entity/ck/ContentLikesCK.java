package com.project.rmfr.entity.ck;

import com.project.rmfr.entity.AllNoticeBoard;
import com.project.rmfr.entity.AllNoticeContents;
import com.project.rmfr.entity.Members;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Embeddable
@Data
public class ContentLikesCK implements Serializable {

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(referencedColumnName = "ancUuid", name="contentId")
    private AllNoticeContents contentId;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(referencedColumnName = "mId", name="contentLikerId")
    private Members contentLikerId;
}
