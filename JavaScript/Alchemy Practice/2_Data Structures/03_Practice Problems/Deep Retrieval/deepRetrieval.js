// retrieve a prop that is deeply nested within objects
// i.e. { prop: { prop: { prop: 3 }}} => 3
const obj =
    {
        prop:
            {
                prop:
                    {
                        prop: 4
                    }
            }
    };

// retrieve a prop that is deeply nested within objects
// i.e. { prop: { prop: { prop: 3 }}} => 3
function deepRetrieval(obj) {
    if(typeof(obj.prop)==="number" || typeof(obj.prop)==="boolean" || typeof(obj.prop)==="string"){
        return obj.prop;
    }
    return deepRetrieval(obj.prop);
}


console.log(deepRetrieval(obj))

module.exports = deepRetrieval;