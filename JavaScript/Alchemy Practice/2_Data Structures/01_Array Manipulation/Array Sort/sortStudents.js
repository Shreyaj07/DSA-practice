const students = [
    { id: 1, graduated: true, grade: 86 },
    { id: 2, graduated: false, grade: 96 },
    { id: 3, graduated: false, grade: 78 },
    { id: 4, graduated: true, grade: 96 },
];



function sortStudents(students) {
    return students.sort(function comparison(a,b){
        if(a.graduated && !b.graduated){
            return -1;
        }
        if(!a.graduated && b.graduated){
            return 1;
        }
        return b.grade - a.grade;
    });
}

sortStudents(students)
console.log(students)
module.exports = sortStudents;