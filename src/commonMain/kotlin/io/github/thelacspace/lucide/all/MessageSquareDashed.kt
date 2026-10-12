package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MessageSquareDashed") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0,3.0)
                lineTo(16.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,19.0)
                lineTo(14.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,12.0)
                lineTo(2.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,16.0)
                lineTo(2.0,21.285999298095703)
                curveTo(2.0000367164611816,21.573139190673828,2.1730220317840576,21.831989288330078,2.4383068084716797,21.94186782836914)
                curveTo(2.7035913467407227,22.051746368408203,3.0089428424835205,21.99102020263672,3.2119998931884766,21.788000106811523)
                lineTo(4.361000061035156,20.638999938964844)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,19.0)
                curveTo(21.104570388793945,19.0,22.0,18.104570388793945,22.0,17.0)
                lineTo(22.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,10.0)
                lineTo(22.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,6.0)
                lineTo(22.0,5.0)
                curveTo(22.0,3.895430564880371,21.104570388793945,3.0,20.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,3.0)
                curveTo(2.895430564880371,3.0,2.0,3.895430564880371,2.0,5.0)
                lineTo(2.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,19.0)
                lineTo(10.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,3.0)
                lineTo(10.0,3.0)
            }
}

public val LucideIcons.All.MessageSquareDashedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MessageSquareDashed: ImageVector
    @Composable get() = MessageSquareDashedDefinition.asImageVector()
