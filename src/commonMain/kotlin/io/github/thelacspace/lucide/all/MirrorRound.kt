package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MirrorRound") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,6.599999904632568)
                lineTo(8.600000381469727,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,18.0)
                lineTo(12.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,7.5)
                lineTo(9.5,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,22.0)
                lineTo(17.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,10.0)
                curveTo(3.98717999458313,12.866647720336914,5.509161472320557,15.521041870117188,7.989636421203613,16.958078384399414)
                curveTo(10.470111846923828,18.395116806030273,13.529888153076172,18.395116806030273,16.01036262512207,16.958078384399414)
                curveTo(18.4908390045166,15.521041870117188,20.012819290161133,12.866647720336914,20.0,10.0)
                curveTo(20.012819290161133,7.133352279663086,18.4908390045166,4.4789581298828125,16.01036262512207,3.0419209003448486)
                curveTo(13.529888153076172,1.6048834323883057,10.470111846923828,1.6048834323883057,7.989636421203613,3.0419209003448486)
                curveTo(5.509161472320557,4.4789581298828125,3.98717999458313,7.133352279663086,4.0,10.0)
            }
}

public val LucideIcons.All.MirrorRoundDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MirrorRound: ImageVector
    @Composable get() = MirrorRoundDefinition.asImageVector()
