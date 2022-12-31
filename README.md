# Kubernetes POJOs
Auto-Generated Plain Old Java Objects (POJO) from Kubernetes API Swagger specs (official) with [jsonschema2pojo](https://www.jsonschema2pojo.org).

```sh
cat k8s-api-swagger.json | yq -P > k8s-api-swagger.yaml
io.k8s((\.)([a-zA-Z|1]+))+ > io_k8s_$3
# grep all types
grep -E "io.k8s((\.)([a-z|1-2|\-]+))+((\.)([a-zA-Z]+):)" k8s-api-swagger-definitions-only.yaml | wc -l
508
# definitions and usages
grep -E "io.k8s((\.)([a-z|1-2|\-]+))+((\.)([a-zA-Z]+))" k8s-api-swagger-definitions-only.yaml | wc -l
1377
# canonical names
grep -E "io.k8s((\.)([a-z|1-2|\-]+))+((\.)([a-zA-Z]+):)" k8s-api-swagger-definitions-only.yaml | grep -E "io.k8s((\.)([a-z|1-2|\-]+))+"
# just the packages
grep -E "io.k8s((\.)([a-z|1-2|\-]+))+((\.)([a-zA-Z]+):)" ../k8s-api-swagger-definitions-only.yaml | grep -Eo "io.k8s((\.)([a-z|1-2|\-]+))+" | sort --unique > packages.txt
mkdir -p `cat ../packages.txt`

# VS Code - just the class name
io.k8s((?<dot>\.)(\w+))+ --> $3
```

For JSON Schema to POJO, [two files are needed](https://github.com/joelittlejohn/jsonschema2pojo/issues/990); the definitions (from Swagger: k8s-api-swagger-definitions-only.json) and the referenced schema (what I need/want) to "force" the generation of code (k8s-api-schema.json).

```sh
jsonschema2pojo --source k8s-api-schema.json --target java-gen -a JACKSON2 -R --package la.rebelion.k8s.api --include-dynamic-accessors --generate-constructors --constructors-include-copy-constructor
```

## License

<a rel="license" href="http://creativecommons.org/licenses/by-sa/4.0/"><img alt="Creative Commons License" style="border-width:0" src="https://i.creativecommons.org/l/by-sa/4.0/88x31.png" /></a><br /><span xmlns:dct="http://purl.org/dc/terms/" property="dct:title">Kubernetes POJOs</span> by <a xmlns:cc="http://creativecommons.org/ns#" href="https://rebelion.la" property="cc:attributionName" rel="cc:attributionURL">La Rebelion Labs </a> is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by-sa/4.0/">Creative Commons Attribution-ShareAlike 4.0 International License</a>.<br />Based on a work at <a xmlns:dct="http://purl.org/dc/terms/" href="https://github.com/la-rebelion/kubernetes-pojos" rel="dct:source">https://github.com/la-rebelion/kubernetes-pojos</a>.

## References

* [API reference (v1.25)](https://github.com/kubernetes-sigs/reference-docs/tree/master/gen-apidocs/config/v1_25)
* [Kubernetes's OpenAPI Specification](https://github.com/kubernetes/kubernetes/tree/release-1.25/api/openapi-spec)