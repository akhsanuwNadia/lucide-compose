package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SearchSlash") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.5,8.5)
                lineTo(8.5,13.5)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,11.0)
                curveTo(2.98717999458313,13.866647720336914,4.509161472320557,16.521041870117188,6.989636421203613,17.958078384399414)
                curveTo(9.470111846923828,19.395116806030273,12.529888153076172,19.395116806030273,15.010363578796387,17.958078384399414)
                curveTo(17.4908390045166,16.521041870117188,19.012819290161133,13.866647720336914,19.0,11.0)
                curveTo(19.012819290161133,8.133352279663086,17.4908390045166,5.4789581298828125,15.010363578796387,4.0419206619262695)
                curveTo(12.529888153076172,2.6048834323883057,9.470111846923828,2.6048834323883057,6.989636421203613,4.0419206619262695)
                curveTo(4.509161472320557,5.4789581298828125,2.98717999458313,8.133352279663086,3.0,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,21.0)
                lineTo(16.700000762939453,16.700000762939453)
            }
}

public val LucideIcons.All.SearchSlashDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SearchSlash: ImageVector
    @Composable get() = SearchSlashDefinition.asImageVector()
