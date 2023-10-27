const MONTHS = [
    'JAN', 'FEB', 'MAR', 'APR', 'MAY', 'JUN',
    'JUL', 'AUG', 'SEP', 'OCT', 'NOV', 'DEC'
];

function sortByMonth(events) {
    return events.sort(function comparison(a,b){
        return MONTHS.indexOf(a.month) - MONTHS.indexOf(b.month);
    })
}

module.exports = sortByMonth;