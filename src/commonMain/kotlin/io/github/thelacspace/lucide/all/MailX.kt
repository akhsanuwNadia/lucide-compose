package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MailX") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22.0f,12.532f)
                lineTo(22.0f,6.0f)
                curveTo(22.0f,4.8954306f,21.10457f,4.0f,20.0f,4.0f)
                lineTo(4.0f,4.0f)
                curveTo(2.8954306f,4.0f,2.0f,4.8954306f,2.0f,6.0f)
                lineTo(2.0f,18.0f)
                curveTo(2.0f,19.10457f,2.8954306f,20.0f,4.0f,20.0f)
                lineTo(12.792f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,7.0f)
                lineTo(13.009f,12.727f)
                curveTo(12.387915f,13.08774f,11.621085f,13.08774f,11.0f,12.727f)
                lineTo(2.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.5f,16.5f)
                lineTo(21.5f,21.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.5f,16.5f)
                lineTo(16.5f,21.5f)
            }
}

public val LucideIcons.All.MailXDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MailX: ImageVector
    @Composable get() = MailXDefinition.asImageVector()
