package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BookHeadphones") { strokeWidth ->
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
            lucidePath(strokeWidth) {
                moveTo(8.0f,12.0f)
                lineTo(8.0f,10.0f)
                curveTo(8.009849f,7.7978435f,9.797822f,6.0178485f,12.0f,6.0178485f)
                curveTo(14.202178f,6.0178485f,15.990151f,7.7978435f,16.0f,10.0f)
                lineTo(16.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,12.0f)
                curveTo(13.998398f,12.358331f,14.188645f,12.69013f,14.498705f,12.86976f)
                curveTo(14.8087635f,13.04939f,15.1912365f,13.04939f,15.501295f,12.86976f)
                curveTo(15.811355f,12.69013f,16.001602f,12.358331f,16.0f,12.0f)
                curveTo(16.001602f,11.641669f,15.811355f,11.30987f,15.501295f,11.13024f)
                curveTo(15.1912365f,10.95061f,14.8087635f,10.95061f,14.498705f,11.13024f)
                curveTo(14.188645f,11.30987f,13.998398f,11.641669f,14.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,12.0f)
                curveTo(7.9983974f,12.358331f,8.188645f,12.69013f,8.498705f,12.86976f)
                curveTo(8.8087635f,13.04939f,9.1912365f,13.04939f,9.501295f,12.86976f)
                curveTo(9.811355f,12.69013f,10.001602f,12.358331f,10.0f,12.0f)
                curveTo(10.001602f,11.641669f,9.811355f,11.30987f,9.501295f,11.13024f)
                curveTo(9.1912365f,10.95061f,8.8087635f,10.95061f,8.498705f,11.13024f)
                curveTo(8.188645f,11.30987f,7.9983974f,11.641669f,8.0f,12.0f)
            }
}

public val LucideIcons.All.BookHeadphonesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BookHeadphones: ImageVector
    @Composable get() = BookHeadphonesDefinition.asImageVector()
