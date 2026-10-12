package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Dog") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.25f,16.25f)
                lineTo(12.75f,16.25f)
                lineTo(12.0f,17.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,14.0f)
                lineTo(16.0f,14.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.42f,11.247f)
                curveTo(4.140132f,12.327704f,3.998997f,13.439645f,4.0f,14.556f)
                curveTo(4.0f,18.728f,7.582f,21.0f,12.0f,21.0f)
                curveTo(16.418f,21.0f,20.0f,18.728f,20.0f,14.556f)
                curveTo(19.994999f,13.435081f,19.82897f,12.320695f,19.507f,11.247f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,14.0f)
                lineTo(8.0f,14.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.5f,8.5f)
                curveTo(8.116f,9.55f,7.417f,10.528f,6.156f,11.0f)
                curveTo(4.2250004f,11.722f,2.5800002f,10.703f,2.5000002f,10.0f)
                curveTo(2.3870003f,9.006f,3.6770003f,3.4699998f,6.5f,3.0f)
                curveTo(8.423f,2.679f,10.151f,3.845f,10.151f,5.2349997f)
                curveTo(11.41579f,4.913779f,12.74252f,4.928256f,14.0f,5.277f)
                curveTo(14.0f,3.887f,15.844f,2.679f,17.767f,3.0f)
                curveTo(20.59f,3.47f,21.880001f,9.0060005f,21.767f,10.0f)
                curveTo(21.687f,10.703f,20.042f,11.722f,18.111f,11.0f)
                curveTo(16.85f,10.528f,16.256f,9.55f,15.872f,8.5f)
            }
}

public val LucideIcons.All.DogDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Dog: ImageVector
    @Composable get() = DogDefinition.asImageVector()
