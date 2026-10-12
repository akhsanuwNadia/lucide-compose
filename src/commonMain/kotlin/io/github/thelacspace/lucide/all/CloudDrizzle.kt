package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CloudDrizzle") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f,14.899f)
                curveTo(1.9649427f,12.819778f,1.4281534f,9.698528f,2.6516678f,7.058901f)
                curveTo(3.8751822f,4.4192734f,6.6038933f,2.8116407f,9.505769f,3.0207758f)
                curveTo(12.407645f,3.2299106f,14.877634f,5.2122073f,15.71f,8.0f)
                lineTo(17.5f,8.0f)
                curveTo(19.482357f,7.9997735f,21.231363f,9.296799f,21.806772f,11.193807f)
                curveTo(22.382181f,13.090815f,21.64844f,15.140918f,20.0f,16.242f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,19.0f)
                lineTo(8.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,14.0f)
                lineTo(8.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,19.0f)
                lineTo(16.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,14.0f)
                lineTo(16.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,21.0f)
                lineTo(12.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,16.0f)
                lineTo(12.0f,17.0f)
            }
}

public val LucideIcons.All.CloudDrizzleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CloudDrizzle: ImageVector
    @Composable get() = CloudDrizzleDefinition.asImageVector()
