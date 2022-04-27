# ci-cd-test 프로젝트
### `Github Action`을 사용한 CI/CD 시연 프로젝트
- `Github Flow` 적용
- `Dockerfile`을 사용한 이미지 빌드 & 배포
- 각 서버별 이미지 업데이트 후 컨테이너 자동 재실행(`watchtower` 사용)
  + 테스트 서버 30초 단위 이미지 갱신 체크
  + 운영서버 24시간 단위 이미지 갱신 체크

### 추가 기능
- [ ] 긴급 배포의 경우 즉시 이미지 갱신 및 컨테이너 재실행
  + 이미지 갱신 및 컨테이너 재실행 전략 수립 필요
- [ ] `JIRA` 연동 : 작업 요청단위로 PR 진행 상황 등 연동(연공 가능 범위 파악 필요)
- [ ] `Slack` 연동 : PR 요청 및 리뷰 결과 알림, 리뷰어에게 PR 등록 알림, 이미지 배포 알림 등, 오류 알림 등..
- [ ] 기타 등등
- test1
