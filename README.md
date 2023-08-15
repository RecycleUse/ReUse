# ReUse

-------
# 유즈케이스
![image](https://github.com/RecycleUse/ReUse/assets/107871734/d423b0f2-61d2-4bac-8548-fd0ffeaf7fc6)

-------
# Git Flow
```
main      ----o----------------o
              \\                \\
dev            o----------------o
             /  \\              / \\
personA      o---o            o---o
           /      \\          /     \\
personA-1  o       o        o       o

personB        o----------------o
             /                /
personB-1     o                o

```

- `main`: 메인 브랜치로, 최종적으로 안정된 코드가 병합됩니다.
- `dev`: 개발 브랜치로, 개발 중인 코드가 병합됩니다.
- `personA`, `personB`: 각 사용자의 이름으로 된 브랜치로, 해당 사용자의 작업이 병합됩니다.
- `personA-1`, `personB-1`: 각 사용자의 이름에 숫자가 붙은 브랜치로, 특정 작업을 위해 생성됩니다.
1. `personA-1`과 `personB-1`에서 작업을 수행합니다.
2. `personA-1`은 `personA`에, `personB-1`은 `personB`에 병합됩니다.
3. `personA`과 `personB`이 `dev`에 병합됩니다.
4. `dev`에서 테스트 후, `main`에 병합하여 최종 배포합니다.
