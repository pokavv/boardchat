# BoardChat 프로젝트

## 🖥️ 프로젝트 소개
WebSocket 을 이용해서 실시간 채팅을 구현한 Springboot 게시판 만들기

## 개발 기간
23.12.06 ~ 23.12.24

## ⚙️ 개발 환경
- **Language** : 'Java 17'
- **Farmework** : 'Springboot 3.2.0'
- **Database** : 'PostgreSql 16.0'
- **ORM** : 'MyBatis 3.0.3'
- 'websocket'
- 'thymeleaf'
- 'lombok'

## 🔍 프로젝트 흐름


## 📌 주요 기능
#### 회원관리
- 로그인 (/login)
- 로그아웃 (/logout)
- 로그인 체크 필터

#### 게시판
- 글 목록 (/posts)
- 글 검색
- 글 상세 페이지 (/posts/{postId})
- 글 작성, 읽기, 수정, 삭제 (CRUD)

#### 댓글
- 각 게시글마다 댓글 기능 추가
- 댓글 목록, 댓글 작성 (/posts/{postId}/comments)

#### 채팅
- 클라이언트 간 연결을 지속적으로 유지하는 websocket 이용 (/chat)
- UUID로 생성한 세션id로 채팅방 접속
- 채팅 작성 및 채팅 참여 로그 확인

## 목표
- 최대한 MVC패턴을 지키기
- jquery, ajax, websocket 의 사용법을 제대로 익혀서 댓글, 채팅 기능 구현 
