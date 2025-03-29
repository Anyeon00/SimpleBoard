# simpleboard
oracle, mybatis(+eclipse)를 이용한 간단게시판 구현

## 기술
spring web mvc <br>
oracle <br>
mybatis <br>

## 도메인
user - userId, username, password <br>
board - boardId, userId, title, content <br>
comment - commentId, boardId, user_id, content <br>

## DB테이블
user - user_id(pk), username, password <br>
board - board_id(pk), user_id(fk), title, content <br>
comment - comment_id(pk), board_id(fk), user_id(fk), content <br>
 
```sql
create table "user" (
    user_id number primary key,
    username varchar2(24) not null, -- 한글1글자 3byte
    "password" varchar2(24) not null
);
create sequence seq_user;   

create table board (
    board_id number primary key,
    user_id number not null,
    title varchar2(50) not null,
    "content" varchar2(4000) not null
);
create sequence seq_board;
alter table board add constraint fk_user_board 
foreign key(user_id) references "user"(user_id) on delete cascade;

create table "comment" (
    comment_id number primary key,
    board_id number not null,
    user_id number not null,
    "content" varchar2(2000) not null
);
create sequence seq_comment;
alter table "comment" add constraint fk_board_comment
foreign key(board_id) references board(board_id) on delete cascade;
alter table "comment" add constraint fk_user_comment
foreign key(user_id) references "user"(user_id) on delete cascade;
```

## 요구사항
회원 생성 <br>
회원 전체조회 <br>
회원 삭제 <br>

게시글 작성 <br>
게시글 전체 조회 <br>
게시글 상세 조회 <br>
게시글 수정 <br>
게시글 삭제 <br>

댓글 작성 <br>
게시글의 댓글 조회 <br>
댓글 수정 <br>
댓글 삭제 <br>

## 엔드 포인트
POST	/api/user <br>
GET		/api/user <br>
DELETE	/api/user/{userId} <br>

POST	/api/board <br>
GET		/api/board <br>
GET		/api/board/{boardId} <br>
PUT		/api/board/{boardId} <br>
DELETE	/api/board/{boardId} <br>

POST	/api/comment <br>
GET		/api/comment <br>
PUT		/api/comment/{commentId} <br>
DELETE	/api/comment/{commentId} <br>

## 기타 사항
- 주석은 User 기능에 중심적으로 작성
- Cascade Delete 까지 테스트 완료
- Comment 기능은 단순 반복 작업이라 생략

