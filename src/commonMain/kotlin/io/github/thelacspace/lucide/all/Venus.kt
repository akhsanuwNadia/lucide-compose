package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Venus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,15.0f)
                lineTo(12.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,19.0f)
                lineTo(15.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,9.0f)
                curveTo(5.990385f,11.149985f,7.131871f,13.140781f,8.992228f,14.218559f)
                curveTo(10.852584f,15.296337f,13.147416f,15.296337f,15.007772f,14.218559f)
                curveTo(16.86813f,13.140781f,18.009615f,11.149985f,18.0f,9.0f)
                curveTo(18.009615f,6.850014f,16.86813f,4.8592186f,15.007772f,3.7814407f)
                curveTo(13.147416f,2.7036626f,10.852584f,2.7036626f,8.992228f,3.7814407f)
                curveTo(7.131871f,4.8592186f,5.990385f,6.850014f,6.0f,9.0f)
            }
}

public val LucideIcons.All.VenusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Venus: ImageVector
    @Composable get() = VenusDefinition.asImageVector()
