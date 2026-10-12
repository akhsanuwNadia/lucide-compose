package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Castle") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,5.0)
                lineTo(10.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,5.0)
                lineTo(14.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,21.0)
                lineTo(15.0,18.0)
                curveTo(14.992613792419434,16.3483829498291,13.651634216308594,15.013386726379395,12.0,15.013386726379395)
                curveTo(10.348365783691406,15.013386726379395,9.007386207580566,16.3483829498291,9.0,18.0)
                lineTo(9.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,3.0)
                lineTo(18.0,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,5.0)
                lineTo(6.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,11.0)
                lineTo(2.0,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,9.0)
                lineTo(22.0,19.0)
                curveTo(22.0,20.104570388793945,21.104570388793945,21.0,20.0,21.0)
                lineTo(4.0,21.0)
                curveTo(2.895430564880371,21.0,2.0,20.104570388793945,2.0,19.0)
                lineTo(2.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,3.0)
                lineTo(6.0,11.0)
            }
}

public val LucideIcons.All.CastleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Castle: ImageVector
    @Composable get() = CastleDefinition.asImageVector()
