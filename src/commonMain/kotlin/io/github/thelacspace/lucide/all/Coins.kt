package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Coins") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.744f,17.736f)
                curveTo(12.915005f,20.477089f,10.26446f,22.250267f,7.414466f,21.970371f)
                curveTo(4.5644727f,21.690474f,2.3095276f,19.435528f,2.0296304f,16.585535f)
                curveTo(1.7497333f,13.735542f,3.5229113f,11.084996f,6.2640004f,10.2560005f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,6.0f)
                lineTo(16.0f,6.0f)
                lineTo(16.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.134f,14.768f)
                lineTo(7.0f,14.268f)
                lineTo(9.0f,17.732f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,8.0f)
                curveTo(9.990385f,10.149985f,11.131871f,12.140781f,12.992228f,13.218559f)
                curveTo(14.852584f,14.296337f,17.147417f,14.296337f,19.007772f,13.218559f)
                curveTo(20.86813f,12.140781f,22.009615f,10.149985f,22.0f,8.0f)
                curveTo(22.009615f,5.850014f,20.86813f,3.8592188f,19.007772f,2.7814407f)
                curveTo(17.147417f,1.7036626f,14.852584f,1.7036626f,12.992228f,2.7814407f)
                curveTo(11.131871f,3.8592188f,9.990385f,5.850014f,10.0f,8.0f)
            }
}

public val LucideIcons.All.CoinsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Coins: ImageVector
    @Composable get() = CoinsDefinition.asImageVector()
