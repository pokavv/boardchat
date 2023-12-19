function hasCode(value) {
    return ((value.charCodeAt(value.length - 1) - 0xAC00) % 28) > 0;
}

function isValid(target, fieldName, focusTarget) {
    if (target.value.trim()) {
        return true;
    }

    const particle = (hasCode(fieldName)) ? '을' : '를'
    const elementType = (target.type === 'text' || target.type === 'password' || target.type === 'search' || target.type === 'textarea') ? '입력' : '선택';
    alert( `${fieldName + particle} ${elementType}해 주세요.` );

    target.value = '';
    ( !focusTarget ? target : focusTarget).focus();
    throw new Error(`"${target.id}" is required...`)
}

function countingLength(commentBody) {
    if (commentBody.value.length > 300) {
        alert('댓글을 300자 이하로 입력해 주세요.');
        commentBody.value = commentBody.value.substring(0, 300);
        commentBody.focus();
    }
    document.getElementById('counter').innerText = commentBody.value.length + '/300자';
}

function saveComment() {
    const commentBody = document.getElementById('commentBody');
    isValid(commentBody, '댓글');

    const postId = [[ ${post.postId} ]];
    const.params = {
        postId : postId,
        commentBody : commentBody.value
    }

    $.ajax({
        url: '/posts/${postId}/comments',
        type: 'post',
        contentType: 'application/json; charset=utf-8',
        dataType: 'json',
        data: JSON.stringify(params),
        async: false,
        success: function (response) {
            console.log(response);
        },
        error: function (request, status, error) {
            console.log(error);
        }
    })
}