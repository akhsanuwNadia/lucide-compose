package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CircleDashed") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.100000381469727,2.181999921798706)
                curveTo(11.355024337768555,1.939121127128601,12.644976615905762,1.939121127128601,13.90000057220459,2.181999921798706)
            }
            lucidePath(strokeWidth) {
                moveTo(13.899999618530273,21.81800079345703)
                curveTo(12.644975662231445,22.06087875366211,11.355023384094238,22.06087875366211,10.09999942779541,21.81800079345703)
            }
            lucidePath(strokeWidth) {
                moveTo(17.608999252319336,3.7209999561309814)
                curveTo(18.670469284057617,4.440223217010498,19.58371925354004,5.356868743896484,20.298999786376953,6.421000003814697)
            }
            lucidePath(strokeWidth) {
                moveTo(2.181999921798706,13.899999618530273)
                curveTo(1.939121127128601,12.644975662231445,1.939121127128601,11.355023384094238,2.181999921798706,10.09999942779541)
            }
            lucidePath(strokeWidth) {
                moveTo(20.27899932861328,17.608999252319336)
                curveTo(19.559776306152344,18.670469284057617,18.643129348754883,19.58371925354004,17.578998565673828,20.298999786376953)
            }
            lucidePath(strokeWidth) {
                moveTo(21.81800079345703,10.100000381469727)
                curveTo(22.06087875366211,11.355024337768555,22.06087875366211,12.644976615905762,21.81800079345703,13.90000057220459)
            }
            lucidePath(strokeWidth) {
                moveTo(3.7209999561309814,6.390999794006348)
                curveTo(4.440223217010498,5.329529762268066,5.356868743896484,4.416279315948486,6.421000003814697,3.7009997367858887)
            }
            lucidePath(strokeWidth) {
                moveTo(6.390999794006348,20.27899932861328)
                curveTo(5.329529762268066,19.559776306152344,4.416279315948486,18.643129348754883,3.7009997367858887,17.578998565673828)
            }
}

public val LucideIcons.All.CircleDashedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CircleDashed: ImageVector
    @Composable get() = CircleDashedDefinition.asImageVector()
