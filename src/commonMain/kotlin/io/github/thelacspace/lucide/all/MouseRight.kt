package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MouseRight") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,7.318f)
                lineTo(12.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,10.0f)
                lineTo(19.0f,15.0f)
                curveTo(18.982765f,18.853773f,15.853812f,21.968765f,12.0f,21.968765f)
                curveTo(8.146188f,21.968765f,5.017235f,18.853773f,5.0f,15.0f)
                lineTo(5.0f,9.0f)
                curveTo(5.0f,5.473f,7.608f,2.4850001f,11.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,4.0f)
                curveTo(14.996795f,4.716662f,15.377291f,5.3802605f,15.997409f,5.7395196f)
                curveTo(16.617527f,6.098779f,17.382473f,6.098779f,18.00259f,5.7395196f)
                curveTo(18.62271f,5.3802605f,19.003204f,4.716662f,19.0f,4.0f)
                curveTo(19.003204f,3.283338f,18.62271f,2.6197395f,18.00259f,2.2604802f)
                curveTo(17.382473f,1.9012209f,16.617527f,1.9012209f,15.997409f,2.2604802f)
                curveTo(15.377291f,2.6197395f,14.996795f,3.283338f,15.0f,4.0f)
            }
}

public val LucideIcons.All.MouseRightDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MouseRight: ImageVector
    @Composable get() = MouseRightDefinition.asImageVector()
