package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Contact") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0f,2.0f)
                lineTo(16.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,21.0f)
                lineTo(7.0f,19.0f)
                curveTo(7.0f,17.89543f,7.8954306f,17.0f,9.0f,17.0f)
                lineTo(15.0f,17.0f)
                curveTo(16.10457f,17.0f,17.0f,17.89543f,17.0f,19.0f)
                lineTo(17.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,2.0f)
                lineTo(8.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,10.0f)
                curveTo(8.995193f,11.074993f,9.565935f,12.070391f,10.496114f,12.60928f)
                curveTo(11.426291f,13.148169f,12.573709f,13.148169f,13.503886f,12.60928f)
                curveTo(14.434065f,12.070391f,15.004807f,11.074993f,15.0f,10.0f)
                curveTo(15.004807f,8.925007f,14.434065f,7.9296093f,13.503886f,7.3907204f)
                curveTo(12.573709f,6.8518314f,11.426291f,6.8518314f,10.496114f,7.3907204f)
                curveTo(9.565935f,7.9296093f,8.995193f,8.925007f,9.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,3.0f)
                lineTo(19.0f,3.0f)
                lineTo(21.0f,3.0f)
                lineTo(21.0f,21.0f)
                lineTo(19.0f,21.0f)
                lineTo(5.0f,21.0f)
                lineTo(3.0f,21.0f)
                lineTo(3.0f,3.0f)
                lineTo(5.0f,3.0f)
                close()
            }
}

public val LucideIcons.All.ContactDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Contact: ImageVector
    @Composable get() = ContactDefinition.asImageVector()
