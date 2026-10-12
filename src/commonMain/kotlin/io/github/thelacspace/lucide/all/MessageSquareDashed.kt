package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MessageSquareDashed") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0f,3.0f)
                lineTo(16.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,19.0f)
                lineTo(14.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,12.0f)
                lineTo(2.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,16.0f)
                lineTo(2.0f,21.286f)
                curveTo(2.0000367f,21.57314f,2.173022f,21.83199f,2.4383068f,21.941868f)
                curveTo(2.7035913f,22.051746f,3.0089428f,21.99102f,3.212f,21.788f)
                lineTo(4.361f,20.639f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,19.0f)
                curveTo(21.10457f,19.0f,22.0f,18.10457f,22.0f,17.0f)
                lineTo(22.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,10.0f)
                lineTo(22.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,6.0f)
                lineTo(22.0f,5.0f)
                curveTo(22.0f,3.8954306f,21.10457f,3.0f,20.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,3.0f)
                curveTo(2.8954306f,3.0f,2.0f,3.8954306f,2.0f,5.0f)
                lineTo(2.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,19.0f)
                lineTo(10.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,3.0f)
                lineTo(10.0f,3.0f)
            }
}

public val LucideIcons.All.MessageSquareDashedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MessageSquareDashed: ImageVector
    @Composable get() = MessageSquareDashedDefinition.asImageVector()
