package com.example.algoritm.sort;

/**
 * 선택 정렬
 * 처리되지 않은 데이터 중에서 가장 작은 데이터를 선택해 맨 앞에 있는 데이터와 바꾼다
 */
public class Selection_Sort {

    public void sort() {
        int n = 10;
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

        for (int i = 0; i < n; i++) {
            // 가장 작은 원소의 인덱스
            int min_index = i;
            // 탐색 범위 내 가장 작은 원소의 인텍스 찾기
            for (int j = i + 1; j < n; j++) {
                if (arr[min_index] > arr[j]) {
                    min_index = j;
                }
            }
            // 탐색 이후 첫번째 원소와 가장 작은 원소 swap
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
