package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Component") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.536f,11.293f)
                curveTo(15.145618f,11.6835f,15.145618f,12.316501f,15.536f,12.707001f)
                lineTo(17.912f,15.084001f)
                curveTo(18.3025f,15.474382f,18.935501f,15.474382f,19.326f,15.084001f)
                lineTo(21.703001f,12.707001f)
                curveTo(22.093382f,12.316501f,22.093382f,11.683501f,21.703001f,11.293001f)
                lineTo(19.326f,8.916001f)
                curveTo(18.935501f,8.5256195f,18.3025f,8.5256195f,17.912f,8.916001f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(2.297f,11.293f)
                curveTo(1.9066176f,11.6835f,1.9066176f,12.316501f,2.297f,12.707001f)
                lineTo(4.674f,15.084001f)
                curveTo(5.0645f,15.474382f,5.6974998f,15.474382f,6.088f,15.084001f)
                lineTo(8.465f,12.707001f)
                curveTo(8.855382f,12.316501f,8.855382f,11.683501f,8.465f,11.293001f)
                lineTo(6.088f,8.916f)
                curveTo(5.6974998f,8.525619f,5.0645f,8.525619f,4.674f,8.916f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8.916f,17.912f)
                curveTo(8.728224f,18.09957f,8.622714f,18.354092f,8.622714f,18.6195f)
                curveTo(8.622714f,18.884909f,8.728224f,19.139431f,8.916f,19.327f)
                lineTo(11.293f,21.703f)
                curveTo(11.6835f,22.093382f,12.316501f,22.093382f,12.707001f,21.703f)
                lineTo(15.084001f,19.327f)
                curveTo(15.271778f,19.139431f,15.377288f,18.884909f,15.377288f,18.6195f)
                curveTo(15.377288f,18.35409f,15.271778f,18.099567f,15.084001f,17.911999f)
                lineTo(12.707001f,15.535999f)
                curveTo(12.316501f,15.1456175f,11.683501f,15.1456175f,11.293001f,15.535999f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8.916f,4.674f)
                curveTo(8.525619f,5.0645f,8.525619f,5.6974998f,8.916f,6.088f)
                lineTo(11.293f,8.464f)
                curveTo(11.6835f,8.854382f,12.316501f,8.854382f,12.707001f,8.464f)
                lineTo(15.084001f,6.088f)
                curveTo(15.474382f,5.6974998f,15.474382f,5.0645f,15.084001f,4.674f)
                lineTo(12.707001f,2.2969997f)
                curveTo(12.316501f,1.906618f,11.683501f,1.906618f,11.293001f,2.2969997f)
                close()
            }
}

public val LucideIcons.All.ComponentDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Component: ImageVector
    @Composable get() = ComponentDefinition.asImageVector()
