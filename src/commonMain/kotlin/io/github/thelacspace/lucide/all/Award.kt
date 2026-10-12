package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Award") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.477f,12.89f)
                lineTo(16.992f,21.416f)
                curveTo(17.026749f,21.621586f,16.930273f,21.827152f,16.749931f,21.931795f)
                curveTo(16.56959f,22.036438f,16.343245f,22.018187f,16.182001f,21.886f)
                lineTo(12.602001f,19.199f)
                curveTo(12.247058f,18.93383f,11.759944f,18.93383f,11.405001f,19.199f)
                lineTo(7.8190007f,21.885f)
                curveTo(7.6578918f,22.016941f,7.431876f,22.035213f,7.2516637f,21.930868f)
                curveTo(7.0714517f,21.826523f,6.9747796f,21.62141f,7.009001f,21.416f)
                lineTo(8.523001f,12.89f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,8.0f)
                curveTo(5.990385f,10.149985f,7.131871f,12.140781f,8.992228f,13.218559f)
                curveTo(10.852584f,14.296337f,13.147416f,14.296337f,15.007772f,13.218559f)
                curveTo(16.86813f,12.140781f,18.009615f,10.149985f,18.0f,8.0f)
                curveTo(18.009615f,5.850014f,16.86813f,3.8592188f,15.007772f,2.7814407f)
                curveTo(13.147416f,1.7036626f,10.852584f,1.7036626f,8.992228f,2.7814407f)
                curveTo(7.131871f,3.8592188f,5.990385f,5.850014f,6.0f,8.0f)
            }
}

public val LucideIcons.All.AwardDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Award: ImageVector
    @Composable get() = AwardDefinition.asImageVector()
