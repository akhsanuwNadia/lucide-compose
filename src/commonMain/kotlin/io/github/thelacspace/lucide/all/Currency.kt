package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Currency") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0,12.0)
                curveTo(3.98717999458313,14.866647720336914,5.509161472320557,17.521041870117188,7.989636421203613,18.958078384399414)
                curveTo(10.470111846923828,20.395116806030273,13.529888153076172,20.395116806030273,16.01036262512207,18.958078384399414)
                curveTo(18.4908390045166,17.521041870117188,20.012819290161133,14.866647720336914,20.0,12.0)
                curveTo(20.012819290161133,9.133352279663086,18.4908390045166,6.4789581298828125,16.01036262512207,5.0419206619262695)
                curveTo(13.529888153076172,3.6048834323883057,10.470111846923828,3.6048834323883057,7.989636421203613,5.0419206619262695)
                curveTo(5.509161472320557,6.4789581298828125,3.98717999458313,9.133352279663086,4.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,3.0)
                lineTo(6.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,3.0)
                lineTo(18.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,21.0)
                lineTo(6.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,21.0)
                lineTo(18.0,18.0)
            }
}

public val LucideIcons.All.CurrencyDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Currency: ImageVector
    @Composable get() = CurrencyDefinition.asImageVector()
