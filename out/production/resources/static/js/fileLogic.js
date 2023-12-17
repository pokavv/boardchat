function selectFile(element) {

    const file = element.files(0);
    const filename = element.closest('.file_input').firstElementChild;

    // 파일 선택 창에서 취소 버튼이 클릭된 경우
    if (!file) {
        filename.value = '';
        return false;
    }

    // 파일 크기가 10MB 를 초과하는 경우
    const fileSize = Math.floor(file.size / 1024 / 1024);
    if (fileSize > 10) {
        alert('10MB 이하의 파일로 업로드해 주세요.');
        filename.value = '';
        element.value = '';
        return false;
    }

    // 파일명 지정
    filename.value = file.name;
}

function addFile() {
    const fileDiv = document.createElement('div');
    fileDiv.innerHTML = '
        <div class="file_input">
            <input type="text" readonly />
            <label> 첨부파일
                <input type="file" name="files" onchange="selectFile(this)";
            </label>
        </div>
        <button type="button" onclick="removeFile(this);" class"btn del_btn">
            <span>삭제</span>
        </button>
    ';

    document.querySelector('file_list').appendChild(fileDiv);
}

function removeFile(element) {
        const fileAddBtn = element.nextElementSibling;
        if (fileAddBtn) {
            const inputs = element.previousElementSibling.querySelectorAll('input');
            inputs.forEach(input => input.value = '')
            return false;
        }
        element.parentElement.remove();
    }

// 출처: https://congsong.tistory.com/39 [Let's develop:티스토리]