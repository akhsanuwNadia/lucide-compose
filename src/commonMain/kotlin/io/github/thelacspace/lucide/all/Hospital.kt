package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Hospital") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,7.0f)
                lineTo(12.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,21.0f)
                lineTo(14.0f,18.0f)
                curveTo(13.995076f,16.898922f,13.1010895f,16.008924f,12.0f,16.008924f)
                curveTo(10.8989105f,16.008924f,10.004924f,16.898922f,10.0f,18.0f)
                lineTo(10.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,9.0f)
                lineTo(10.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,11.0f)
                lineTo(20.0f,11.0f)
                curveTo(21.10457f,11.0f,22.0f,11.895431f,22.0f,13.0f)
                lineTo(22.0f,19.0f)
                curveTo(22.0f,20.10457f,21.10457f,21.0f,20.0f,21.0f)
                lineTo(4.0f,21.0f)
                curveTo(2.8954306f,21.0f,2.0f,20.10457f,2.0f,19.0f)
                lineTo(2.0f,10.0f)
                curveTo(2.0f,8.895431f,2.8954306f,8.0f,4.0f,8.0f)
                lineTo(6.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,21.0f)
                lineTo(18.0f,5.0f)
                curveTo(18.0f,3.8954306f,17.10457f,3.0f,16.0f,3.0f)
                lineTo(8.0f,3.0f)
                curveTo(6.8954306f,3.0f,6.0f,3.8954306f,6.0f,5.0f)
                lineTo(6.0f,21.0f)
            }
}

public val LucideIcons.All.HospitalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Hospital: ImageVector
    @Composable get() = HospitalDefinition.asImageVector()
