
# PolicyRule

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**inline**](#Type) | Rule type determines how condition is evaluated |  |
| **condition** | [**kotlin.Any**](.md) | Condition depends on rule type. status_override: {status}, domain_filter: {domain_mode, domains}, check_requirement: {check, required}, sub_status_override: {sub_status} |  |
| **action** | [**PolicyRuleAction**](PolicyRuleAction.md) |  |  |
| **id** | **kotlin.Int** |  |  [optional] |
| **sequence** | **kotlin.Int** |  |  [optional] |
| **isEnabled** | **kotlin.Boolean** |  |  [optional] |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | status_override, domain_filter, check_requirement, sub_status_override |



