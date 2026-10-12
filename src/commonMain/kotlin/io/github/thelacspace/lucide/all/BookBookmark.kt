package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BookBookmark") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,2.0f)
                lineTo(10.0f,9.750999f)
                curveTo(9.999828f,9.847373f,10.055066f,9.935263f,10.141979f,9.976904f)
                curveTo(10.228891f,10.018545f,10.332001f,10.006521f,10.407f,9.945999f)
                lineTo(12.686999f,8.1119995f)
                curveTo(12.870038f,7.9646792f,13.13096f,7.9646792f,13.313999f,8.1119995f)
                lineTo(15.593999f,9.945999f)
                curveTo(15.669013f,10.005902f,15.771703f,10.017561f,15.858236f,9.975999f)
                curveTo(15.94477f,9.934438f,15.999864f,9.846997f,16.0f,9.751f)
                lineTo(16.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,19.5f)
                lineTo(4.0f,4.5f)
                curveTo(4.0f,3.1192882f,5.119288f,2.0f,6.5f,2.0f)
                lineTo(19.0f,2.0f)
                curveTo(19.552284f,2.0f,20.0f,2.4477153f,20.0f,3.0f)
                lineTo(20.0f,21.0f)
                curveTo(20.0f,21.552284f,19.552284f,22.0f,19.0f,22.0f)
                lineTo(6.5f,22.0f)
                curveTo(5.1236525f,21.993845f,4.0111556f,20.876362f,4.0111556f,19.5f)
                curveTo(4.0111556f,18.123638f,5.1236525f,17.006155f,6.5f,17.0f)
                lineTo(20.0f,17.0f)
            }
}

public val LucideIcons.All.BookBookmarkDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BookBookmark: ImageVector
    @Composable get() = BookBookmarkDefinition.asImageVector()
