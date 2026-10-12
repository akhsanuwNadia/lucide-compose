package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PersonStanding") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0f,5.0f)
                curveTo(10.998398f,5.3583307f,11.188645f,5.69013f,11.498705f,5.86976f)
                curveTo(11.8087635f,6.0493894f,12.1912365f,6.0493894f,12.501295f,5.86976f)
                curveTo(12.811355f,5.69013f,13.001602f,5.3583307f,13.0f,5.0f)
                curveTo(13.001602f,4.6416693f,12.811355f,4.30987f,12.501295f,4.13024f)
                curveTo(12.1912365f,3.9506104f,11.8087635f,3.9506104f,11.498705f,4.13024f)
                curveTo(11.188645f,4.30987f,10.998398f,4.6416693f,11.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,20.0f)
                lineTo(12.0f,14.0f)
                lineTo(15.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,8.0f)
                lineTo(12.0f,10.0f)
                lineTo(18.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,10.0f)
                lineTo(12.0f,14.0f)
            }
}

public val LucideIcons.All.PersonStandingDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PersonStanding: ImageVector
    @Composable get() = PersonStandingDefinition.asImageVector()
