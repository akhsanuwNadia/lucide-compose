package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SunMoon") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,2.0f)
                lineTo(12.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.837f,16.385f)
                curveTo(14.15525f,19.260878f,11.4807205f,21.211927f,8.534021f,20.982979f)
                curveTo(5.5873213f,20.754028f,3.2462518f,18.413284f,3.0168946f,15.466616f)
                curveTo(2.7875373f,12.519947f,4.7382164f,9.845149f,7.614f,9.163f)
                curveTo(8.238f,9.016f,8.584f,9.823f,8.3289995f,10.411f)
                curveTo(7.6776333f,11.916829f,8.011855f,13.667726f,9.172095f,14.8277445f)
                curveTo(10.3323345f,15.987763f,12.083294f,16.321653f,13.589f,15.67f)
                curveTo(14.1779995f,15.415f,14.985f,15.76f,14.837f,16.385f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,12.0f)
                curveTo(16.0f,9.790861f,14.209139f,8.0f,12.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,5.0f)
                lineTo(17.744f,6.256f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,12.0f)
                lineTo(22.0f,12.0f)
            }
}

public val LucideIcons.All.SunMoonDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SunMoon: ImageVector
    @Composable get() = SunMoonDefinition.asImageVector()
