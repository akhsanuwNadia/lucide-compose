package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("NepaliRupee") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.0,16.17300033569336)
                curveTo(19.77646827697754,14.72599983215332,20.26361846923828,12.215460777282715,19.15725326538086,10.20906925201416)
                curveTo(18.05088996887207,8.202676773071289,15.667763710021973,7.274866104125977,13.496000289916992,8.005000114440918)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,3.0)
                lineTo(20.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,13.0)
                lineTo(13.5,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,13.0)
                lineTo(9.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,13.0)
                curveTo(15.5,13.0,14.666999816894531,3.0,8.0,3.0)
            }
}

public val LucideIcons.All.NepaliRupeeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.NepaliRupee: ImageVector
    @Composable get() = NepaliRupeeDefinition.asImageVector()
