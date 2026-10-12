package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("DoorClosedPackage") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.0f,13.0f)
                lineTo(18.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,9.0f)
                lineTo(19.0f,5.0f)
                curveTo(19.0f,3.8954306f,18.10457f,3.0f,17.0f,3.0f)
                lineTo(7.0f,3.0f)
                curveTo(5.8954306f,3.0f,5.0f,3.8954306f,5.0f,5.0f)
                lineTo(5.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,21.0f)
                lineTo(10.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,12.0f)
                lineTo(9.01f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,13.0f)
                lineTo(21.0f,13.0f)
                lineTo(22.0f,13.0f)
                lineTo(22.0f,21.0f)
                lineTo(21.0f,21.0f)
                lineTo(15.0f,21.0f)
                lineTo(14.0f,21.0f)
                lineTo(14.0f,13.0f)
                lineTo(15.0f,13.0f)
                close()
            }
}

public val LucideIcons.All.DoorClosedPackageDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.DoorClosedPackage: ImageVector
    @Composable get() = DoorClosedPackageDefinition.asImageVector()
