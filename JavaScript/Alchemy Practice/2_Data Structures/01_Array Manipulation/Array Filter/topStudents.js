function topStudents(array) {
    return array.filter((function(student){
        return student.grade >= 90;
    }))
}

module.exports = topStudents;