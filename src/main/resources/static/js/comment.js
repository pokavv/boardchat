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