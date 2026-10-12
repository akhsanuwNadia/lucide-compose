package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CloudFog") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0,14.89900016784668)
                curveTo(1.9649426937103271,12.819778442382812,1.428153395652771,9.698528289794922,2.651667833328247,7.058900833129883)
                curveTo(3.8751821517944336,4.419273376464844,6.603893280029297,2.811640739440918,9.505768775939941,3.02077579498291)
                curveTo(12.407645225524902,3.2299106121063232,14.877634048461914,5.212207317352295,15.710000038146973,8.0)
                lineTo(17.5,8.0)
                curveTo(19.482357025146484,7.9997735023498535,21.23136329650879,9.296798706054688,21.806772232055664,11.193806648254395)
                curveTo(22.38218116760254,13.090814590454102,21.648439407348633,15.140917778015137,20.0,16.242000579833984)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,17.0)
                lineTo(7.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,21.0)
                lineTo(9.0,21.0)
            }
}

public val LucideIcons.All.CloudFogDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CloudFog: ImageVector
    @Composable get() = CloudFogDefinition.asImageVector()
