package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Beer") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.0f,11.0f)
                lineTo(18.0f,11.0f)
                curveTo(19.651617f,11.007386f,20.986614f,12.348366f,20.986614f,14.0f)
                curveTo(20.986614f,15.651634f,19.651617f,16.992613f,18.0f,17.0f)
                lineTo(17.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,12.0f)
                lineTo(9.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0f,12.0f)
                lineTo(13.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,7.5f)
                curveTo(13.0f,7.5f,12.559999f,8.0f,11.0f,8.0f)
                curveTo(9.440001f,8.0f,9.0f,7.5f,8.0f,7.5f)
                curveTo(7.0f,7.5f,6.2799997f,8.0f,5.5f,8.0f)
                curveTo(4.1236525f,7.993845f,3.0111554f,6.8763614f,3.0111554f,5.5f)
                curveTo(3.0111554f,4.1236386f,4.1236525f,3.0061553f,5.5f,3.0f)
                curveTo(6.2799997f,3.0f,7.07f,3.5f,8.0f,3.5f)
                curveTo(8.93f,3.5f,9.44f,2.0f,11.0f,2.0f)
                curveTo(12.56f,2.0f,13.0f,3.5f,14.0f,3.5f)
                curveTo(15.0f,3.5f,15.72f,3.0f,16.5f,3.0f)
                curveTo(17.876348f,3.0061553f,18.988844f,4.1236386f,18.988844f,5.5f)
                curveTo(18.988844f,6.8763614f,17.876348f,7.993845f,16.5f,8.0f)
                curveTo(15.72f,8.0f,15.0f,7.5f,14.0f,7.5f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,8.0f)
                lineTo(5.0f,20.0f)
                curveTo(5.0f,21.10457f,5.8954306f,22.0f,7.0f,22.0f)
                lineTo(15.0f,22.0f)
                curveTo(16.10457f,22.0f,17.0f,21.10457f,17.0f,20.0f)
                lineTo(17.0f,8.0f)
            }
}

public val LucideIcons.All.BeerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Beer: ImageVector
    @Composable get() = BeerDefinition.asImageVector()
